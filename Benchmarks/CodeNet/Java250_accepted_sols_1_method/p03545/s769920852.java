import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n[] = sc.nextLine().split("");
        int num[] = new int[4];

        for(int i=0; i<4; i++){
            num[i] = Integer.parseInt(n[i]);
        }

        for(int i=0; i<8; i++){
            int sum = num[0];
            String s = String.valueOf(num[0]);
            for(int j=0; j<3; j++){
                if((1&i>>j)==1){
                    sum += num[j+1];
                    s += "+" + num[j+1];
                }else{
                    sum -= num[j+1];
                    s += "-" + num[j+1];
                }
            }
            if(sum == 7){
                System.out.println(s + "=7");
                return;
            }
        }
    }
}