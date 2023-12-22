import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//ques No
        int m = sc.nextInt();//ans No

        int p;//ques No
        String s;//kekka

        // Set<Integer> OK = new HashSet<Integer>(); //AC count
        // List<Integer> PENA = new ArrayList<>();//wrong
        // List<Integer> list = new ArrayList<>();

        int[] ok_ar = new int[n];//in first oK
        int[] wa = new int[n];
        int ans1 = 0;

        for(int i = 0;i<n;i++){
            ok_ar[i] = 0;
            wa[i] = 0; 
        }

        for(int i = 0 ; i < m ; i++){
            p = sc.nextInt()-1;
            s = sc.next();

            if(s.equals("WA")){
                wa[p]++;
            }else if(s.equals("AC")){
                if(ok_ar[p] == 0){
                    ans1 = ans1 + wa[p];
                }
                ok_ar[p] = 1;
            }
        }
        int ans2 = 0;
        for(int i= 0;i<n;i++){
            ans2 = ans2 + ok_ar[i];
        }
        System.out.print(ans2 + " "+ ans1);

    }
}