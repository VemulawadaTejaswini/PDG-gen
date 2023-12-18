import java.io.*;

    public static void main(String[] args) {
        System.out.println("H");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=null;

        try{
            str=br.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }

        int K=Integer.parseInt(str);

        try{
            str=br.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }

        if((str.length()<K)||(str.length()==K)){
                System.out.print(str);
        }
        if(str.length()>K){
            for (int i=0;i<K;i++){
                System.out.print(str[i]);
            }
            System.out.print("...");
        }
    }