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
		int i,j,n,num,count=0,f=0;
		String com="";
		n=scan.nextInt();
		List[] list=new List[n];
		for(i=0;i<n;i++){
			com=scan.next();
			switch(com){
				case "insert":
					num=scan.nextInt();
					for(j=count-1;j>=0;j--){
						list[j+1]=list[j];
					}
					list[0]=new List(num);
					count++;
					break;
				case "delete":
					num=scan.nextInt();
					for(j=0;j<count;j++){
						if(list[j].num==num){
							f=1;
							break;
						}
					}
					if(f==1){
						for(j+=0;j<count-1;j++){
							list[j]=list[j+1];
						}
						count--;
					}
					f=0;
					break;
				case "deleteFirst":
					for(j=0;j<count-1;j++){
						list[j]=list[j+1];
					}
					count--;
					break;
				case "deleteLast":
					count--;
					break;
				default:
					continue;
			}
		}
		for(i=0;i<count;i++)

		{
			list[i].Show();
			if(i<count-1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
