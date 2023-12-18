import java.io.*;
import java.util.*;
public class Main {
	BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	String input = null;
	ArrayList<Integer> sleepedstart = new ArrayList<Integer>(0);
	ArrayList<Integer> sleepedend = new ArrayList<Integer>(0);
	int time = 0;
	int result = 0;
	int sleeptimerest = 0;
	int sleeptime = 0;
	int awaketimerest = 0;
	int ctime = 0;
	public static void main(String []args){
		Main r = new Main();
		r.Run();
	}
	public void Run(){
		try{
			input = buff.readLine();
			String get[] = input.split(" ");
			int a = Integer.parseInt(get[0]);
			int b = Integer.parseInt(get[1]);
			int c = Integer.parseInt(get[2]);
			awaketimerest = a;
			ctime = c;
			while(true){
				time++;
				ctime--;
				if(awaketimerest > 0 && ctime == 0){//テ」ツ?淌」ツ?ゥテ」ツつ甘ァツ敖?」ツ??」ツ??
					result = time;
					break;
				}else if(ctime == 0){//テ・ツッツ敕ゥツ?偲」ツ?氾」ツ?療」ツ??= bテ」ツ?ョテ・ツ個コテゥツ鳴禿・ツ??」ツ?ォテ・ツュツ佚・ツ慊ィテ」ツ?づァツ渉セテ・ツ慊ィテ」ツ?ョテヲツョツ凝」ツつ甘ヲツ卍づゥツ鳴禿・ツ按?ゥツ?イテ」ツつ?」ツつ凝」ツ?ィテ・ツッツ敕」ツ?淌ヲツ卍づゥツ鳴禿」ツ?ョテァツオツづ」ツつ湘」ツつ甘」ツ?古・ツ按、テヲツ伉?
					if(sleepedstart.contains((time+sleeptimerest) % 60) &&
							sleepedend.contains((time-sleeptime)%60)){
						result = -1;
						break;
					}
					sleepedstart.add((time+sleeptimerest) % 60);
					sleepedend.add((time-sleeptime) % 60);
					ctime = 60;
				}
				if(awaketimerest != 0){
					awaketimerest--;
					if(awaketimerest == 0){
						sleeptimerest = b;
						sleeptime = 0;
					}
				}else if(sleeptimerest != 0){
					sleeptimerest--;
					sleeptime++;
					if(sleeptimerest == 0){
						awaketimerest = a;
					}
				}
			}
			System.out.println(result);
		}catch(Exception e){
				
		}
	}
}