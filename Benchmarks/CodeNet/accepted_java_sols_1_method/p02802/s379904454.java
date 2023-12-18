import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int n = stdIn.nextInt(); //出題問題数
        int m = stdIn.nextInt(); //高橋提出数
        int plo[] = new int[n];
        int penanum[] = new int[n];
        int ac = 0;
        
        for(int i = 0; i < n; i++){
            plo[i] = 0;
            penanum[i] = 0;
        }
        
        //int x = stdIn.nextInt();
        //int num[] = new int[];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        
        for(int i = 0; i < m; i++){
            int num = stdIn.nextInt();
            
            if(plo[num - 1] == 0){
                String res = stdIn.next();
                if(res.equals("AC")){
                    ac++;
                    plo[num - 1] = 1;
                }else{
                    penanum[num - 1]++;
                }
            }else{
                String gomi = stdIn.next();
            }
        }
        
        int pena = 0;
        
        for(int i = 0; i < n; i++){
            if(plo[i] == 1){
                pena += penanum[i];
            }
        }
        
        System.out.println(ac + " " + pena);
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}