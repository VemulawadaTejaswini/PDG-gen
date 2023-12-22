import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int num = Integer.parseInt(array[0]);
        int min=num,max=num;
        long sum=num;
        for(int i=1;i<N;i++){
            num=Integer.parseInt(array[i]);
            if(num<min) min=num;
            if(num>max) max=num;
            sum+=num;
        }
        System.out.println(min+" "+max+" "+sum);
	}
}