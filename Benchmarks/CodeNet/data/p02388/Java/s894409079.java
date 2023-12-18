import java.io.*;  

class XCubic{
  public static void main(String args[])throws IOException{
    
    int x = 0;

    System.out.println("3乗したい整数xを入力して下さい(1 ? x ? 100)\n");

    InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                String buf = br.readLine();
                        x = Integer.parseInt(buf);
                try{
	if(1 <= x && x <= 100){
		x=x*x*x;
	}else{
		System.out.println("整数xは1 ? x ? 100です。もう一度入力して下さい\n");
		buf = br.readLine();
                        x = Integer.parseInt(buf);
                        x=x*x*x;
}

                        
                }catch(Exception e){
                        x = 0;
                }
                System.out.println("xの3乗は" + x);
    
  }
}