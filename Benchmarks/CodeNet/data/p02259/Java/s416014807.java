import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        String strArr[] = str.split(" ");
        int line[] = new int[n];
        
        int cnt = 0;
        for(int i=0; i<n; i++){
			line[i] = Integer.parseInt(strArr[i]);
		}
		
        boolean flag = true;		
        while(flag){
            flag = false;
            for(int j=(n-1); j>0; j--){
                if(line[j] < line[j-1] ){
                    int tmp = line[j];
                    line[j] = line[j-1];
                    line[j-1] = tmp;
                    cnt++;
                    flag=true;
                }
            }
        }
        
		String outsd = Integer.toString(line[0]);
		for(int i=1; i<n; i++){
			outsd += " "+line[i];
		}
		System.out.println(outsd);
		System.out.println(cnt);
    }

}

