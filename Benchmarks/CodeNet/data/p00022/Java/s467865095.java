import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n, tmp, max;
            boolean marged;
            ArrayList<Integer> list;
            while (true) {
                n = Integer.parseInt(br.readLine());
                if (n == 0) {
                    break;
                }
                
                list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    list.add(Integer.parseInt(br.readLine()));
                }

                for (int i = 0; i < list.size() - 1; i++) {
                    while (true) {
                        if (list.get(i) * list.get(i + 1) > 0) {
                            list.set(i, list.get(i) + list.get(i + 1));
                            list.remove(i + 1);
                            if (i + 1 == list.size()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                
                if (list.get(0) < 0) {
                    list.remove(0);
                }
                
                if (list.get(list.size() - 1) < 0) {
                    list.remove(list.size() - 1);
                }
                
                marged = false;
                for (int i = 0; i < list.size() - 2; i += 2) {
                    if (list.get(i + 1) + list.get(i) >= 0 && list.get(i + 2) + list.get(i + 1) >= 0) {
                        list.set(i, list.get(i) + list.get(i + 1) + list.get(i + 2));
                        list.remove(i + 1);
                        list.remove(i + 1);
                        marged = true;
                    }
                    if (marged) {
                        i = -2;
                        marged = false;
                    }

                }
                
                max = 0;
                for (int i = 0; i < list.size(); i += 2) {
                    tmp = 0;
                    for (int j = i; j < list.size(); j++) {
                        tmp += list.get(j);
                        if (list.get(j) > 0 && tmp > max) {
                            max = tmp;
                        }
                    }
                }
                System.out.println(max);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}