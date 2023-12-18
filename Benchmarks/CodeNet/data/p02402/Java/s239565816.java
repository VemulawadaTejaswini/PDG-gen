import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
		String s=br.readLine();
        int num = Integer.parseInt(s.substring(0, s.indexOf(" ")));
        int min=num,max=num;
        long sum=num;
        String[] a=s.substring(s.indexOf(" ")+1).split(" ");
        for(String n:a){
        	num=Integer.parseInt(n);
            if(num<min) min=num;
            if(num>max) max=num;
            sum+=num;
        }
        System.out.println(min+" "+max+" "+sum);
	}
}