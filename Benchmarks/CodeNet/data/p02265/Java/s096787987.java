import java.util.Scanner;

class List{
	int num;

	public List(int n){
		num=n;
	}

	public void Show(){
		System.out.print(num);
	}
}

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int i,j,n,num,start=0,end=0,f=0;
		String com="";
		n=scan.nextInt();
		List[] list=new List[n];
		for(i=0;i<n;i++){
			com=scan.next();
			switch(com){
				case "insert":
					num=scan.nextInt();
					for(j=end-1;j>=start;j--){
						list[j+1]=list[j];
					}
					list[start]=new List(num);
					end++;
					break;
				case "delete":
					num=scan.nextInt();
					for(j=start;j<end;j++){
						if(list[j].num==num){
							f=1;
							break;
						}
					}
					if(f==1){
						for(j+=0;j<end-1;j++){
							list[j]=list[j+1];
						}
						end--;
					}
					f=0;
					break;
				case "deleteFirst":
					start++;
					break;
				case "deleteLast":
					end--;
					break;
				default:
					continue;
			}
		}
		for(i=start;i<end;i++){
			list[i].Show();
			if(i<end-1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
