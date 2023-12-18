import java.util.*;


class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String s = sc.nextLine();
            if(s.equals("0"))break;
            int sum=0;
            for(int i=0;i<s.length();i++){
                sum += Integer.parseInt(Character.toString(s.charAt(i)));
            }
            System.out.println(sum);
            
        }
    }
}