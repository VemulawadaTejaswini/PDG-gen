import java.security.SecureRandom;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();

            int n=sc.nextInt();
            int a[]= new int[n];
            Set<Integer> s= new HashSet<>();
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                s.add(a[i]);
            }
            int min=Integer.MAX_VALUE;
            int index=0;
            for (int i=x;i>=-1000;i--){
                if (!s.contains(i)){
                    if (min>Math.abs(x-i)){
                        min=Math.abs(x-i);
                        index=i;
                        break;
                    }

                }
            }
        for (int i=x;i<=1000;i++){
            if (!s.contains(i)){
                if (min>Math.abs(x-i)){
                    min=Math.abs(x-i);
                    index=i;
                    break;
                }

            }
        }
        System.out.println(index);


        }
    }




