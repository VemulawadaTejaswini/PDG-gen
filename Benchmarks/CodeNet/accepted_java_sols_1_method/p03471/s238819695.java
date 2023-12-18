import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        
        for(int i = y/10000;i >= 0;i--)
            for(int j = 0;10000*i+5000*j <= y;j++){
                if(10000*i+5000*j+1000*(n-i-j) == y ){
                    System.out.println(i+" "+j+" "+(n-i-j));
                    return;
                }
            }
                
            
        System.out.println((-1)+" "+(-1)+" "+(-1));
    }
}
