import java.io.*;
public class Main {
    public static void main(String[] args){
        int[] H;
        int[] W;
        int i,j,k,l;
        H = new int[1000];
        W = new int[1000];
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            k=0;
            while(true){
            String tate=reader.readLine();
            String[] count1 = tate.split(" ");
            H[k] = Integer.parseInt(count1[0]);
            W[k] = Integer.parseInt(count1[1]);
            if(H[k]==0 && W[k]==0){
                break;
            }
            k++;
            }
            for(l=0;l<k;l++){
                for(i=0;i<H[l];i++){
                    if(i>0){
                        System.out.print("\n");
                    }
                    for(j=0;j<W[l];j++){
                        System.out.print("#");
                }
            }
            System.out.println("\n");
        }
        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println("wrong");
        }
    }
}

