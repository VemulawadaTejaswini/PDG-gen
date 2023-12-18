import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sa = sc.nextLine();
        sa +=sa;
        int i = sa.length();
        String sb = sc.nextLine();
        int k = sb.length();
        sc.close();
        boolean isExist = false;
        for(int l=0; l < i;l++){
        	if(i - (l+k) >=0) {
        		if(sa.substring(l,l+k).equals(sb)){
        			isExist = true;
        		}
        	}
       	}
        if(isExist){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
