import java.util.*;
 
 
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int abcd[] = new int[4];
        for(int i=0; i<4; i++){
            abcd[i] = Integer.valueOf(String.valueOf(s.charAt(i)));
        }
        int n = 3;
        String pm[] = new String[3];
        for(int i=0; i<3;i++){
            pm[i] = "";
        }

        for(int i = 0;i < Math.pow(2,n);i++) {
            int sum = abcd[0];
            for(int j=0; j<n;j++){
                if((1 & i>>j) == 1) {
                    sum += abcd[j+1];
                    pm[j] = "+";
                } else {
                    sum -= abcd[j+1];
                    pm[j] = "-";
                }
            }
            if(sum==7){
                System.out.print(abcd[0]);
                for(int k=0; k<3; k++){
                    System.out.print(pm[k]);
                    System.out.print(abcd[k+1]);
                }
                System.out.println("=7");
                return;
            }
        }

    }
}