

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		ArrayList<Rect> rects = new ArrayList<Rect>();
		for (int i = 1; i < 151; i++) {
			for (int j = i+1; j < 151; j++) {
				rects.add(new Rect(j,i));
			}
		}
		Collections.sort(rects);
		while(true){
			int h = stdin.nextInt();
			int w = stdin.nextInt();
			if(h == 0) break;
			int idx = getIndex(h,w,rects);
			Rect rect = rects.get(idx+1);
			System.out.println(rect.h + " " + rect.w);
		}
		stdin.close();

	}
	static int getIndex(int h, int w, ArrayList<Rect> rects){
		for(int i = 0; i < rects.size(); i++){
			if(rects.get(i).h == h && rects.get(i).w == w){
				return i;
			}
		}
		return -1;
	}
}
class Rect implements Comparable<Rect>{
	int h, w;
	int diagonal;
	Rect(int w, int h){
		this.h = h;
		this.w = w;
		diagonal = w*w+h*h;
	}
	@Override
	public int compareTo(Rect o) {
		// TODO ?????????????????????????????????????????????
		if(diagonal != o.diagonal){
			return diagonal - o.diagonal;
		}else{
			return h - o.h;
		}
	}
}