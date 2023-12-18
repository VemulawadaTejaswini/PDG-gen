import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = sc.nextInt()-1;
        int b = sc.nextInt()-1;
        int c = sc.nextInt()-1;
        int d = sc.nextInt()-1;
        String s = sc.next();
        boolean[] sf = new boolean[n];
        for(int i=0; i<n; i++){
            sf[i] = (s.charAt(i)=='.');
        }
        
        for(int i=0; i<500_000; i++){
            if(a!=c){
                if(sf[a+1] && a+1!=b){
                    a++;
                }else if(sf[a+2] && a+2!=b){
                    a+=2;
                }else if(b!=d){
                    if(sf[b+1]){
                        b++;
                    }else if(sf[b+2]){
                        b+=2;
                    }
                }
            }else if(b!=d){
                if(sf[b+1]){
                    b++;
                }else if(sf[b+2]){
                    b+=2;
                }
            }
            //System.out.println(a + " ; " + b);
        }
        
        
        
        if(a==c && b==d){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}