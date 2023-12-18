import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //0m 1f 2r
        int[] test = new int[3];
        String result = "";
        
        while(true){
            for(int i=0; i<3; i++){
                test[i] = sc.nextInt();
            }
            
            if(test[0]==-1 && test[1]==-1 && test[2]==-1){
                break;
            }
            
            if(test[0]==-1 || test[1]==-1){
                result = "F";
            }else if(test[0]+test[1] >= 80){
                result = "A";
            }else if(test[0]+test[1] >= 65){
                result = "B";
            }else if(test[0]+test[1] >= 50){
                result = "C";
            }else if(test[0]+test[1] >= 30){
                if(test[2] >= 50){
                    result = "C";
                }else{
                    result = "D";
                }
            }else{
                result = "F";
            }
            System.out.println(result);
        }
    }
}
