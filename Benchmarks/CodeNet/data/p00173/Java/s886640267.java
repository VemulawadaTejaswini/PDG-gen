import java.awt.geom.Point2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		//		while(in.hasNext())
		new AOJ0173();
	}

	class AOJ0173{
		public AOJ0173() {
			Kurasu[] kurasu = new Kurasu[9];
			for(int i=0;i<9;i++)kurasu[i] = new Kurasu(in.next(), in.nextInt(), in.nextInt());
//			Arrays.sort(kurasu);
			for(int i=0;i<9;i++)System.out.println(kurasu[i].name+" "+(kurasu[i].am+kurasu[i].pm)+" "+kurasu[i].kei);
		}
		class Kurasu /*implements Comparable<Kurasu>*/{
			int am,pm;
			int kei;
			String name;
			public Kurasu(String name,int am,int pm) {
				this.am = am;
				this.pm = pm;
				this.name = name;
				kei = am*200+pm*300;
			}
//			public int compareTo(Kurasu o) {
//				if(this.kei>o.kei)return -1;
//				else if(this.kei<o.kei)return 1;
//				return 0;
//			}
		}
	}
}