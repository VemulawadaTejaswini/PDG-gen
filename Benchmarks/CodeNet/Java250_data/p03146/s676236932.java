import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int answer=1;
        List<Integer> list = new ArrayList<>();
        boolean returnFlag=false;
        
        list.add(a);
        answer+=1;
        if(a%2!=0){
            a=3*a+1;
        }else{
            a=a/2;
        }

        if(list.contains(a)){
            System.out.println(answer);
            return;
        }
        
        while(!returnFlag){
            list.add(a);
            answer+=1;
            if(a%2!=0){
                //奇数の時
                a=3*a+1;
                
            }else{
                a=a/2;
            }

            if(list.contains(a)){
                System.out.println(answer);
                return;
            }
        }    
    }
}
