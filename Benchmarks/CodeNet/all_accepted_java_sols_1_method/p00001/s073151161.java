import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] a) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int i = 0;
        int one=0;
        int two=0;
        int three=0;

        while(i<10){
        	int num=Integer.parseInt(br.readLine());
        	if(one<=num){
        		three=two;
        		two=one;
        		one=num;
        	}else if(two <= num){
        		three = two;
        		two=num;
        	}else if(three <=num){
        		three=num;
        	}
        	i++;
        }
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
	}
}