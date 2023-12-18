import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==1){
				System.out.println("0");
			}else if(n==2){
				System.out.println("1");
			}else{
				ArrayList<Integer> list=new ArrayList<Integer>();
				list.add(2);
				for(int i=3;i<=n;i=i+2){
					boolean prime=true;
					for(int j=0;j<list.size();j++){
						if(i%list.get(j)==0){
							prime=false;
							break;
						}
					}
					if(prime){
						list.add(i);
					}
				}
				System.out.println(list.size());
			}
		}
	}
}