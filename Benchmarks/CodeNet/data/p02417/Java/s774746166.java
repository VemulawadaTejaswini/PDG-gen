public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String input="";
        char[] text=new char[1000];
        
        while(true){
            String in;
            in=br.readLine();
            if(in.equals("")){break;}
            else{input+=in;}            
        }
        
        text=input.toCharArray();
        
        for(int i=97;i<=122;i++){
            int count=0;
            for(int j=0;j<text.length;j++){
                if(text[j]==(char)(i)){
                    count+=1;
                }
            }
            System.out.println((char)(i)+":"+count);
        }
        
    }
}