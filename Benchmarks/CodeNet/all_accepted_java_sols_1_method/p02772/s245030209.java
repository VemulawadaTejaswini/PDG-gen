import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int tmp = sc.nextInt();
            if(tmp%2==0){
                if(!(tmp%3==0 || tmp%5==0)){
                    System.out.println("DENIED");
                    return;
                }
            }
            else{
                continue;
            }
        }
        System.out.println("APPROVED");
        return;
    }
}
