import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char alpha;
        int[] alpha_num = new int[26];
        String str ="";

        while(sc.hasNext()){
            str += sc.nextLine();
        }

            for(int i = 0;i < str.length();i++){
                alpha = str.charAt(i);
                for(int j = 0;j < 26;j++){
                    if(alpha == (65 + j) || alpha == (97 + j))  alpha_num[j] += 1;
                }
            }

            for(int i = 0;i < 26;i++){
                System.out.println((char)(97 + i)+" : "+alpha_num[i]);
            }
        
    }
}
