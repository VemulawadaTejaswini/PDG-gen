import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){

		String line[] = br.readLine().split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[0]);
		int c = Integer.parseInt(line[0]);
		int products[] = new int[a+b+c];
		Arrays.fill(products, 2);

		int n = Integer.parseInt(br.readLine());
		if(n==0){break;}
		ArrayList<Integer[]> wronglist = new ArrayList<Integer[]>();

		for(int i=0; i<n; i++){
			String test[] = br.readLine().split(" ");
			if(test[3].equals("1")){
				products[Integer.parseInt(test[0])-1] = 1;
				products[Integer.parseInt(test[1])-1] = 1;
				products[Integer.parseInt(test[2])-1] = 1;
			}else{
				Integer[] addlist = {Integer.parseInt(test[0])-1, Integer.parseInt(test[1])-1, Integer.parseInt(test[2])-1};
				wronglist.add(addlist);
			}
		}

		for(Integer[] testno: wronglist){
			if(products[testno[0]] * products[testno[1]] * products[testno[2]] == 2){
				if(products[testno[0]] == 2){
					products[testno[0]] = 0;
				}else if(products[testno[1]] == 2){
					products[testno[1]] = 0;
				}else{
					products[testno[2]] = 0;
				}
			}
		}

		for(Integer result: products){
			System.out.println(result);
		}
		}
	}
}