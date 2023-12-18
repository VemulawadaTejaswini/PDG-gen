import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int bannum = sc.nextInt();
		String keyword = sc.next();
		String kanban;
		int cnt = 2;
		int knum = 0;
		for(int s = 0;s < bannum;s++){
			kanban = sc.next();
			loop:for(int i = 0; kanban.length()-i > keyword.length()-1;i++){
				if(keyword.charAt(0) == kanban.charAt(i)){
					for(int j = kanban.length()-1;j-i>=keyword.length()-1;j--){
						if(keyword.charAt(keyword.length()-1) == kanban.charAt(j)){
							cnt = 2;
							for(int k = 1;k <= keyword.length()-1;k++){
								//System.out.println(keyword.charAt(k));
								//System.out.println(kanban.charAt((j-i)/(keyword.length()-1)*k+i));
								if(keyword.charAt(k) == kanban.charAt((j-i)/(keyword.length()-1)*k+i)){
									cnt++;
									if(cnt-1 == keyword.length()){
										knum++;
										break loop;
									}								
								}
							}
						}
					}
				}
			}			
		}
		System.out.println(knum);
/*		if(cnt-1 == keyword.length()){
			System.out.print("?????£??????");
		}
	*/	
		
	}

}