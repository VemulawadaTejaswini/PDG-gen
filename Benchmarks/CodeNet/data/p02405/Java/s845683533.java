import java.io.*;

public class Main{
    public static void main(String[]args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        while(true){
            String[] str = br.readLine().split(" ");
            int h = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);
            
            if(h==0 && w==0){
                break;
            }else{
                while(true){
                    if(count==h)break;
                    System.out.print(write_odd(w));
                    System.out.println();
                    count++;
                    if(count==h)break;
                    System.out.print(write_even(w));
                    System.out.println();
                    count++;
                }
                System.out.println();
                count=0;
            }
        }
    }
    
    public static String write_odd(int w){
        String str ="";
        for(int i=1;i<w+1;i++){
           if(i%2!=0){ str = str+"#";}
           else{ str = str+".";}
        }
        return str;
    }
    
    public static String write_even(int w){
        String str ="";
        for(int i=1;i<w+1;i++){
           if(i%2!=0){ str = str+".";}
           else{ str = str+"#";}
        }
        return str;
    }
}