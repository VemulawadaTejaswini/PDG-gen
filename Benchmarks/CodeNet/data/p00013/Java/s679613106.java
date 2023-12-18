import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int num;
		stackList sl = new stackList();
		
		while(str!=null){
			num=Integer.parseInt(str);
			if(num>0){
				sl.setList(num);
			}else if (num==0){
				System.out.println(sl.getList());
			}else{
				System.out.println("0??\????????´??°?????\?????????????????????");
			}
			str=br.readLine();
		}
	}

}

final class stackList {
	int[] array = new int[10];
	int index = 0;	//??????????????????????????????????????????
	
	stackList(){
		for(int i=0;i<10;i++){
			array[i]=0;
		}
	}
	
	public void setList(int num){
		array[index]=num;
		index++;
	}
	
	public int getList(){
		int tmp;
		if(index-1<0){
			index=1;
		}
		tmp = array[index-1];
		array[index-1]=0;
		index--;
		return tmp;
	}
}