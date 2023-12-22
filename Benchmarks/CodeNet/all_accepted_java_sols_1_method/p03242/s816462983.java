import java.util.*;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') sb.append("9");
            else if(s.charAt(i)=='9') sb.append("1");
            else sb.append(s.charAt(i));
        }


        System.out.println(sb.toString());
    }
}
