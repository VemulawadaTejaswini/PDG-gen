import java.util.Scanner;

//足りないトランプを表示する。

public class Main {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		//カードの配列
		int[][] array = new int[4][13];
        //所持数
        int have = sc.nextInt();
        //記号
        String kigo;
        String supe = "S" ;
        String hart = "H" ;
        String curo = "C" ;
        String daia = "D" ;
        //カードの数字
        int num;
        //記号を数値化したもの
        int kigonum = 0;
        
        //配列に初期値を入力
        for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    array[i][j]=0;
                }
			}
		
        //カードを入力
		for (int i=0;i<have;i++){
            kigo = sc.next();
			num=sc.nextInt();
            
            //記号を数値化
            if(kigo.equals(supe)) kigonum=0;
            else if(kigo.equals(hart)) kigonum=1;
            else if(kigo.equals(curo)) kigonum=2;
            else if(kigo.equals(daia)) kigonum=3;
            
            array[kigonum][num-1]=1;
		}
		kigo = "";
		//カードのチェック
			for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                if(array[i][j]==0){
                    if(i==0) kigo="S";
                    else if(i==1) kigo="H";
                    else if(i==2) kigo="C";
                    else if(i==3) kigo="D";
                    System.out.println(kigo +" "+ (j+1));
                }
			}
        }
		sc.close();
	}
}
