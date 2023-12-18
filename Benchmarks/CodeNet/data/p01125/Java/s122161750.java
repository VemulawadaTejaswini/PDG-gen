
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	private static final int fieldXSize=20+1, fieldYSize=20+1;
	private static final int initXPos=10, initYPos=10;

	private static final boolean[][] initField() {
		boolean[][] field=new boolean[fieldYSize][fieldXSize];
		for(int i=0; i<field.length; i++)
			Arrays.fill(field[i], false);
		return field;
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LinkedList<Boolean> res=new LinkedList<Boolean>();
		while(true) {

			// input gem
			int gemNum=Integer.parseInt(br.readLine());
			if(gemNum==0)
				break;
			boolean[][] field=initField();
			for(int i=0; i<gemNum; i++) {
				String[] strArray=br.readLine().split(" ");
				int x=Integer.parseInt(strArray[0]),y=Integer.parseInt(strArray[1]);
				field[field.length-1-y][x]=true;
			}

			// read & execute instruction
			int instNum=Integer.parseInt(br.readLine());
			int posX=initXPos, posY=initYPos;
			int gemCount=0;
			for(int i=0; i<instNum; i++) {
				String[] strArray=br.readLine().split(" ");
				int val=Integer.parseInt(strArray[1]);
				int dx=0, dy=0;
				if(strArray[0].equals("N")) dy=-1;
				if(strArray[0].equals("S")) dy=+1;
				if(strArray[0].equals("E")) dx=+1;
				if(strArray[0].equals("W")) dx=-1;
				for(int j=0; j<val; j++) {
					posX+=dx;
					posY+=dy;
					if(field[posY][posX]) {
						field[posY][posX]=false;
						gemCount++;
					}
				}
			}

			res.add(gemCount==gemNum);
		}

		for(boolean b: res)
			System.out.println(b?"YES":"NO");
	}
}