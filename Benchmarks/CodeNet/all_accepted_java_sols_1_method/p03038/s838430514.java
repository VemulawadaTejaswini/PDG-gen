import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Long> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextLong());
        }
        List<Map.Entry<Integer, Long>> BC = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            Map.Entry<Integer, Long> entry =
                    new AbstractMap.SimpleEntry<>(scanner.nextInt(), scanner.nextLong());
            BC.add(entry);
        }
        scanner.close();

        // A sort
        Collections.sort(A);

        // BC sort
        Collections.sort(BC, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        // B count
        long bCount = 0;
        // B C
        List<Long> replaceList = new ArrayList<>();
        for (Map.Entry<Integer, Long> entry : BC) {
            int b = entry.getKey();
            long c = entry.getValue();
            for (int j = 0; j < b; j++) {
                replaceList.add(c);
                bCount++;
                if (replaceList.size() == N) {
                    break;
                }
            }
            if (replaceList.size() == N) {
                break;
            }
        }
        Collections.sort(replaceList);
        Collections.reverse(replaceList);

//        System.out.println(BC);

        for (int i = 0; i < bCount; i++) {
            long a = A.get(i);
            long bc = replaceList.get(i);
            if (a < bc) {
                A.set(i, bc);
//                System.out.println(A);
            } else {
                break;
            }
        }

        long sum = 0;
        for (long l : A) {
            sum += l;
        }

        System.out.println(sum);

//        System.out.println(System.currentTimeMillis() - startTime);
    }


}
