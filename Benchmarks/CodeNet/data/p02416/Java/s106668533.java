import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int i = 0;
            int sum = 0;
            String s = sc.next();
            if(s.equals("0")){
                break;
            }
            
            for(int j=0;j<s.length();j++){
                if(Character.getNumericValue(s.charAt(j))==0){
                }else{
              sum +=  Character.getNumericValue(s.charAt(j));
                
                }
            }
            
                System.out.print(sum);
            System.out.println();
        }
        sc.close();
    }
}
