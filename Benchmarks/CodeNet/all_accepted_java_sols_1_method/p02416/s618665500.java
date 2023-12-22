public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while(true){
			String x = scan.nextLine();
			if("0".equals(x)){
				break;
			}
			int sum = 0;
			for(char v : x.toCharArray()){
				sum += Integer.parseInt(String.valueOf(v));
			}
			System.out.println(sum);
		}
	}

}