import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        String s[] =new String[5];
        for(int i=0;i<5;i++){
            s[i]=sc.next();
        }
        int k=Integer.parseInt(sc.next());
        int antn[] =new int[5];
        for(int i=0;i<5;i++){
            antn[i]=Integer.parseInt(s[i]);
        }
        for(int r=0;r<5;r++){
            for(int t=0;t<4;t++){
                if(Math.abs(antn[r]-antn[t])>k){
                    System.out.println(":(");
                    return;
                }
            }
        }
        System.out.println("Yay!");
    }
}