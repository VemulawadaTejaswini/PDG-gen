import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean ans = true;
        String W[] = new String[N];
        for(int i=0;i<N;i++){
            
            W[i] =sc.next();
        
        }
        for(int i=1;i<N;i++){
            
            if(!(W[i-1].charAt(W[i-1].length()-1)==W[i].charAt(0))){
                ans=false;
                break;
            }
            for(int j=0;j<i;j++){
                
                if(W[i].equals(W[j])){
                    ans= false;
                    break;
                }
            }
        }
        if(ans==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
