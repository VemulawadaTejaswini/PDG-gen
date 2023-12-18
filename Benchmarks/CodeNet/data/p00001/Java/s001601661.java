import java.io.IOException;

public class Main {

    public static void main(String[] args){

        try {

            java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));

            int a=0;
            int b=0;
            int c=0;

            for (int i = 0; i < 10 ; i++) {
                int n = Integer.parseInt(r.readLine());

                if(n>a) {
                    a = n;
                }else{
                    if(n>b){
                        b=n;
                    }else{
                        if(n>c){
                            c= n;
                        }
                    }
                }
            }

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        } catch (IOException e) {
            e.printStackTrace();
        }
		
    }
	
}