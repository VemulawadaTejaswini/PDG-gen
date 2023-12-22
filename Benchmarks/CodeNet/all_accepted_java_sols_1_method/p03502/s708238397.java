import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        String buf=String.valueOf(n);
        String answer="Yes";
        int total=0;
        for(int i=0;i<buf.length();i++){
            total+=Character.getNumericValue(buf.charAt(i));
        }
        if(n%total!=0) answer="No";
        System.out.println(answer); 
    }
}