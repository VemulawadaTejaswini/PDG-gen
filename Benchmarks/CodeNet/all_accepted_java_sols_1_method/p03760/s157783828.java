import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] O = sc.next().split("");
        String[] E = sc.next().split("");
        
        String[] password = new String[O.length + E.length];
        
        
        int O_count = 0;
        int E_count = 0;
        for(int i=0; i<password.length; i++){
            if(i % 2 == 0){
                password[i] = O[O_count];
                O_count++;
            }else{
                password[i] = E[E_count];
                E_count++;
            }
            System.out.print(password[i]);
        }
    }
}