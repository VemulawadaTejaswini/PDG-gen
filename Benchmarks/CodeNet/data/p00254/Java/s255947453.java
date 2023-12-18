import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        while(true){
            int num = scan.nextInt();
            int trial=0;
            if (num==0){
                break;
            }
            while(true){
                if(num==6174){
                    System.out.println(trial);
                    break;
                }
                int  foo[] = new int[4];
                for(int i=0;i<=3;i++){
                    int a = num%10;
                    foo[i]=a;
                    num=num/10;
                }
                if (foo[0]==foo[1] && foo[2]==foo[3] && foo[1]==foo[2]){
                    System.out.println("NA");
                    break;
                }

                Integer foo2[]={foo[0],foo[1],foo[2],foo[3]};
                Arrays.sort(foo);
                int l=0;
            
                for(int i=0;i<=3;i++){
                   l+=foo[i]*Math.pow(10, i);
                }
                Arrays.sort(foo2, Collections.reverseOrder());
                
                int s=0;
                for(int i=0;i<=3;i++){
                   s+=foo2[i]*Math.pow(10, i);
                }
                num=l-s;
                trial+=1;
            }
            
        }
    }
}
