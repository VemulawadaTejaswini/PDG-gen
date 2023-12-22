import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int ans = s;
        int m = 0;
        int n = 0;
        int cnt =1;

        list.add(s);

        while(true){
            if(ans%2==0){
                ans=ans/2;
            }else{
                ans=ans*3+1;
            }
            cnt++;

            if(list.contains(ans)){
               n = list.indexOf(ans);
               m = cnt;
               break;

            }else{
                list.add(ans);
            }

        }

        System.out.println(m);


    }
}
