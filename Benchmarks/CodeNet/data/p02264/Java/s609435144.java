import java.util.*;
import java.io.*;

class Que{
    public static void main(String[] args) throws IOException{
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	int task = sc.nextInt();
	Queue<String> listin = new LinkedList<String>(); //キューを入れるリンクドリスト
	Queue<Integer> time = new LinkedList<Integer>();
	
	
	int i,get=0;
	for(i=0 ; i<num ; i++){    //一行を部類を分けて読み込む
	    listin.add(sc.next());
	    time.add(sc.nextInt());
	}
	
	while(listin.size()>0){//キューに入っている数が０以下になったらやめるようにwhile文
	    if(time.peek() - task > 0){//まだ取り除いてない。最初に取り出す数が 引いて 0以上になったら
		listin.add(listin.poll());//番号は取り出して最後に入れる。
		time.add(time.poll() - task);//時間分引いて最後へ入れる
		get += task;//時間は計上する
	    }else{//時間が制限時間ないに解決しそうなら
		get+=time.poll();//時間計上して
		System.out.println(listin.poll() + " " + get);//取り出して表示！（この後入れていないので徐々にsizeが少なくなる）
	    }
	}
    }
}

