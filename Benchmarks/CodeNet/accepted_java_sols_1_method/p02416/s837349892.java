import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String zero = "0";
        while(true){
            String s = sc.next();
            if(zero.equals(s)){
                break;
            }else{
                int sum = 0;
                for(int i=0; i<s.length(); i++){
                    char c = s.charAt(i);
                    sum += (char)(c-48);
                }
            System.out.println(sum);
                }
        }
    }
}
