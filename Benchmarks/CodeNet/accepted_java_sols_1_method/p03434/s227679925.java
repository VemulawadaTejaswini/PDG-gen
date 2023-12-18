import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		String str=sc.nextLine();
		String[] array_str=str.split(" ");

		ArrayList<Integer> array=new ArrayList<Integer>();
		 for(int i=0;i<array_str.length;i++){
			array.add(Integer.parseInt(array_str[i]));
		}
		int Allice_sum=0;
		int Bob_sum=0;
		int chk;
		int chk2;
		for(int i=0;i<array.size();i++){
			chk=array.get(0);
			chk2=0;
			for(int j=0;j<array.size();j++){
				if(chk<array.get(j)){
					chk=array.get(j);
					chk2=j;
				}
			}
			
			array.set(chk2,0);
			if(i%2==0){
				Allice_sum+=chk;
			}else{
				Bob_sum+=chk;
			}
		}
	System.out.println(Allice_sum-Bob_sum);
	}
}
