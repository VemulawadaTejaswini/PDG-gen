import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int k = sc.nextInt();
  
        int array[] = new int[n + 1];
 
        for (int i = 0; i < n; i++) {
            array[sc.nextInt()]++;
        }

        List<Integer> list = new ArrayList<Integer>();
 
        for (int i = 0; i < n + 1; i++) {
            if (array[i] != 0) {
                list.add(array[i]);
            }
        }

        Collections.sort(list);

        long ans = 0;

        for (int i = 0; i < list.size() - k; i++) {
            ans += list.get(i);
        }
 
        System.out.println(ans);
 
        sc.close();
 
        }
 
    }
