import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int N = Integer.parseInt(br.readLine());
            int si[] = new int[4];
            
            for(int i=0; i<N; i++){
                String str = br.readLine();
                
                if(str.equals("AC")){
                    si[0]++;
                }else if(str.equals("WA")){
                    si[1]++;
                }else if(str.equals("TLE")){
                    si[2]++;
                }else if(str.equals("RE")){
                    si[3]++;
                }
            }
            
            System.out.println("AC x " + si[0]);
            System.out.println("WA x " + si[1]);
            System.out.println("TLE x " + si[2]);
            System.out.println("RE x " + si[3]);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}