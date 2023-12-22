import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] ary = br.readLine().split(" ");
        int min = 1000000;
        int max = -1000000;
        long sum = 0;
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(ary[i]);
            if(num<min) min = num;
            if(num>max) max = num;
            sum += num;
        }
        System.out.println(min+" "+max+" "+sum);
	}
}