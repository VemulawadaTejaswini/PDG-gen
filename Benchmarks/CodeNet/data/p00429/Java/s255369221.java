public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line[] = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			if(n==0){break;}
			String answer = br.readLine().split(" ")[0];

			for(int i=0; i<n; i++){
				String result = "";
				char previous = 0;
				int count = 0;

				for(int j=0; j<answer.length(); j++){
					char now = answer.charAt(j);
					if(now == previous){
						count++;
					}else{
						if(count!=0){result += count; result += previous;}
						previous = now;
						count = 1;
					}
				}
				result += count; result += previous;
				answer = result;
			}
			System.out.println(answer);
		}
	}
}