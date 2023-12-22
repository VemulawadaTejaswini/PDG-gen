import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A = 0;
        TreeSet<Integer> ATree = new TreeSet<Integer>();
        TreeSet<Integer> changeTree = new TreeSet<Integer>(Collections.reverseOrder());
        Map<Integer, Integer> duplicateA = new HashMap<Integer, Integer>();
        Map<Integer, Integer> duplicateChange = new HashMap<Integer, Integer>();

        for (int i = 0; i < N; i++) {
            A = sc.nextInt();
            if (ATree.contains(A)) {
                if (duplicateA.containsKey(A)) {
                    duplicateA.put(A, duplicateA.get(A) + 1);
                } else {
                    duplicateA.put(A, 1);
                }
            } else {
                ATree.add(A);
            }
        }

        for (int i = 0; i < M; i++) {
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (changeTree.contains(C)) {
                if (duplicateChange.containsKey(C)) {
                    duplicateChange.put(C, duplicateChange.get(C) + B);
                } else {
                    duplicateChange.put(C, 1);
                }
            } else {
                if (B > 1) {
                    changeTree.add(C);
                    duplicateChange.put(C, B - 1);
                } else {
                    changeTree.add(C);
                }
            }
        }

        Iterator changeIte = changeTree.iterator();
        long sum = 0;
        Integer changeValue = (Integer) changeIte.next();

        for (Integer a : ATree) {
            if (duplicateA.containsKey(a)) {
                for (int i = 0; i <= duplicateA.get(a); i++) {
                    if (a < changeValue) {
                        if (duplicateChange.containsKey(changeValue) && duplicateChange.get(changeValue) > 0) {
                            duplicateChange.put(changeValue, duplicateChange.get(changeValue) - 1);
                            sum += changeValue;
                        } else {
                            if (changeIte.hasNext()) {
                                sum += changeValue;
                                changeValue = (Integer) changeIte.next();
                            } else {
                                sum += changeValue;
                                changeValue = 0;
                            }
                        }
                    } else {
                        sum += a;
                    }
                }
            } else {
                if (a < changeValue) {
                    sum += changeValue;
                } else {
                    sum += a;
                }

                if (changeIte.hasNext()) {
                    if (duplicateChange.containsKey(changeValue) && duplicateChange.get(changeValue) > 0) {
                        duplicateChange.put(changeValue, duplicateChange.get(changeValue) - 1);
                    } else {
                        changeValue = (Integer) changeIte.next();
                    }
                } else {
                    if (duplicateChange.containsKey(changeValue) && duplicateChange.get(changeValue) > 0) {
                        duplicateChange.put(changeValue, duplicateChange.get(changeValue) - 1);
                    } else {
                        changeValue = 0;
                    }
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }
}