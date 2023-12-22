import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String s = sc.next();
            int sum = 0;
            if(s.equals("0"))
                break;
            for(int i=0;i<s.length();i++){
                int n = Character.getNumericValue(s.charAt(i));
                sum += n;
            }
            System.out.println(sum);
        }
    }
}
