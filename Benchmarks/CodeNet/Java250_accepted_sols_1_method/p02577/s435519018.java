import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        long sum = 0;
        int len = n.length();
        for(int i = 0;i<len;i++){
            sum += (int)n.charAt(i) - '0';
        }
        //System.out.println(sum);
        if(sum % 9 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}