import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int half = s.length()/2;
        int cnt=0;

        if(s.length()==1){
            cnt++;
        }
        if(s.length()%2==1){
            cnt++;
        }

        for(int i =0; i<half;i++){
            if(s.charAt(i)!=s.charAt(i+half)){
                cnt++;
            }
        }

        if(cnt==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

     
    }
}
