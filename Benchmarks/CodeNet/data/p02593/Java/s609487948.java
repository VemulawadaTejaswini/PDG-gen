








<!DOCTYPE html>
<html>
<head>
	<title>F - Rooks</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta http-equiv="Content-Language" content="en">
	<meta name="viewport" content="width=device-width,initial-scale=1.0">
	<meta name="format-detection" content="telephone=no">
	<meta name="google-site-verification" content="nXGC_JxO0yoP1qBzMnYD_xgufO6leSLw1kyNo2HZltM" />

	
	<meta name="description" content="AtCoder is a programming contest site for anyone from beginners to experts. We hold weekly programming contests online.">
	<meta name="author" content="AtCoder Inc.">

	<meta property="og:site_name" content="AtCoder">
	
	<meta property="og:title" content="F - Rooks" />
	<meta property="og:description" content="AtCoder is a programming contest site for anyone from beginners to experts. We hold weekly programming contests online." />
	<meta property="og:type" content="website" />
	<meta property="og:url" content="https://atcoder.jp/contests/agc047/tasks/agc047_f" />
	<meta property="og:image" content="https://img.atcoder.jp/assets/atcoder.png" />
	<meta name="twitter:card" content="summary" />
	<meta name="twitter:site" content="@atcoder" />
	
	<meta property="twitter:title" content="F - Rooks" />

	<link href="//fonts.googleapis.com/css?family=Lato:400,700" rel="stylesheet" type="text/css">
	<link rel="stylesheet" type="text/css" href="//img.atcoder.jp/public/8c9497a/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="//img.atcoder.jp/public/8c9497a/css/base.css">
	<link rel="shortcut icon" type="image/png" href="//img.atcoder.jp/assets/favicon.png">
	<link rel="apple-touch-icon" href="//img.atcoder.jp/assets/atcoder.png">
	<script src="//img.atcoder.jp/public/8c9497a/js/lib/jquery-1.9.1.min.js"></script>
	<script src="//img.atcoder.jp/public/8c9497a/js/lib/bootstrap.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/js-cookie/2.1.4/js.cookie.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.1/moment.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.1/locale/ja.js"></script>
	<script>
		var LANG = "en";
		var userScreenName = "wycywf";
		var csrfToken = "pxc8jUTL+cnm+3pHyWXo+ZvXhCoZvLir5KjhyviaOWM="
	</script>
	<script src="//img.atcoder.jp/public/8c9497a/js/utils.js"></script>
	
	
		<script src="//img.atcoder.jp/public/8c9497a/js/contest.js"></script>
		<link href="//img.atcoder.jp/public/8c9497a/css/contest.css" rel="stylesheet" />
		<script>
			var contestScreenName = "agc047";
			var remainingText = "Remaining Time";
			var countDownText = "Contest begins in";
			var startTime = moment("2020-08-09T21:00:00+09:00");
			var endTime = moment("2020-08-09T23:20:00+09:00");
		</script>
		<style></style>
	
	
		<script type="text/x-mathjax-config">MathJax.Hub.Config({messageStyle:"none",tex2jax:{skipTags:["script","noscript","style","textarea","code"],inlineMath:[['\\(','\\)']]},delayStartupUntil:"onload"});</script>
		<script src="//cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.0/MathJax.js?config=TeX-MML-AM_CHTML"></script>
		<script>$(function(){$('var').each(function(){$(this).html('\\('+$(this).html()+'\\)');});});</script>
	
	
		<link href="//cdnjs.cloudflare.com/ajax/libs/select2/4.0.3/css/select2.min.css" rel="stylesheet" />
		<link href="//cdnjs.cloudflare.com/ajax/libs/select2-bootstrap-theme/0.1.0-beta.10/select2-bootstrap.min.css" rel="stylesheet" />
		<script src="//img.atcoder.jp/public/8c9497a/js/lib/select2.min.js"></script>
	
	
		<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/codemirror/5.38.0/codemirror.min.css">
		<script src="//cdnjs.cloudflare.com/ajax/libs/codemirror/5.38.0/codemirror.min.js"></script>
		<script src="//img.atcoder.jp/public/8c9497a/js/codeMirror/merged.js"></script>
	
	
		<script src="//cdn.rawgit.com/google/code-prettify/master/loader/run_prettify.js"></script>
	
	
	
	
	
	
	
	
	
	
	<script src="//img.atcoder.jp/public/8c9497a/js/base.js"></script>
	<script src="//img.atcoder.jp/public/8c9497a/js/ga.js"></script>
</head>

<body>

<script type="text/javascript">
	var __pParams = __pParams || [];
	__pParams.push({client_id: '468', c_1: 'atcodercontest', c_2: 'ClientSite'});
</script>
<script type="text/javascript" src="https://cdn.d2-apps.net/js/tr.js" async></script>


<div id="modal-contest-start" class="modal fade" tabindex="-1" role="dialog">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title">Contest started</h4>
			</div>
			<div class="modal-body">
				<p>AtCoder Grand Contest 047 has begun.</p>
			</div>
			<div class="modal-footer">
				
					<a class="btn btn-primary" href='/contests/agc047/tasks'>Go to the task list page</a>
				
			</div>
		</div>
	</div>
</div>
<div id="modal-contest-end" class="modal fade" tabindex="-1" role="dialog">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title">Contest is over</h4>
			</div>
			<div class="modal-body">
				<p>AtCoder Grand Contest 047 has ended.</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
	</div>
</div>
<div id="main-div" class="float-container">


	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false">
					<span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/home"></a>
			</div>
			<div class="collapse navbar-collapse" id="navbar-collapse">
				<ul class="nav navbar-nav">
				
					<li><a class="contest-title" href="/contests/agc047">AtCoder Grand Contest 047</a></li>
				
				</ul>
				<ul class="nav navbar-nav navbar-right">
					
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
							<img src='//img.atcoder.jp/assets/top/img/flag-lang/en.png'> English <span class="caret"></span>
						</a>
						<ul class="dropdown-menu">
							<li><a href="/contests/agc047/tasks/agc047_f?lang=ja"><img src='//img.atcoder.jp/assets/top/img/flag-lang/ja.png'> 日本語</a></li>
							<li><a href="/contests/agc047/tasks/agc047_f?lang=en"><img src='//img.atcoder.jp/assets/top/img/flag-lang/en.png'> English</a></li>
						</ul>
					</li>
					
					
						<li class="dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
								<span class="glyphicon glyphicon-cog" aria-hidden="true"></span> wycywf (Contestant) <span class="caret"></span>
							</a>
							<ul class="dropdown-menu">
								<li><a href="/users/wycywf"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> My Profile</a></li>
								<li class="divider"></li>
								<li><a href="/settings"><span class="glyphicon glyphicon-wrench" aria-hidden="true"></span> General Settings</a></li>
								<li><a href="/settings/icon"><span class="glyphicon glyphicon-picture" aria-hidden="true"></span> Change Photo</a></li>
								<li><a href="/settings/password"><span class="glyphicon glyphicon-lock" aria-hidden="true"></span> Change Password</a></li>
								<li><a href="/settings/fav"><span class="glyphicon glyphicon-star" aria-hidden="true"></span> Manage Fav</a></li>
								
								
								
								<li class="divider"></li>
								<li><a href="javascript:void(form_logout.submit())"><span class="glyphicon glyphicon-log-out" aria-hidden="true"></span> Sign Out</a></li>
							</ul>
						</li>
					
				</ul>
			</div>
		</div>
	</nav>

	<form method="POST" name="form_logout" action="/logout?continue=https%3A%2F%2Fatcoder.jp%2Fcontests%2Fagc047%2Ftasks%2Fagc047_f">
		<input type="hidden" name="csrf_token" value="pxc8jUTL&#43;cnm&#43;3pHyWXo&#43;ZvXhCoZvLir5KjhyviaOWM=" />
	</form>
	<div id="main-container" class="container"
		 	style="padding-top:50px;">
		

<div class="row">
	<div id="contest-nav-tabs" class="col-sm-12 mb-2 cnvtb-fixed">
	<div>
		<small class="contest-duration">
			
				Contest Duration:
				<a href='http://www.timeanddate.com/worldclock/fixedtime.html?iso=20200809T2100&p1=248' target='blank'><time class='fixtime fixtime-full'>2020-08-09 21:00:00+0900</time></a> ~ <a href='http://www.timeanddate.com/worldclock/fixedtime.html?iso=20200809T2320&p1=248' target='blank'><time class='fixtime fixtime-full'>2020-08-09 23:20:00+0900</time></a> (local time)
				(140 minutes)
			
		</small>
		<small class="back-to-home pull-right"><a href="/home">Back to Home</a></small>
	</div>
	<ul class="nav nav-tabs">
		<li><a href="/contests/agc047"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Top</a></li>
		
			<li class="active"><a href="/contests/agc047/tasks"><span class="glyphicon glyphicon-tasks" aria-hidden="true"></span> Tasks</a></li>
		

		
			<li><a href="/contests/agc047/clarifications"><span class="glyphicon glyphicon-question-sign" aria-hidden="true"></span> Clarifications <span id="clar-badge" class="badge"></span></a></li>
		

		
			<li><a href="/contests/agc047/submit?taskScreenName=agc047_f"><span class="glyphicon glyphicon-send" aria-hidden="true"></span> Submit</a></li>
		

		
			<li>
				<a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-list" aria-hidden="true"></span> Results<span class="caret"></span></a>
				<ul class="dropdown-menu">
					
					
						<li><a href="/contests/agc047/submissions/me"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> My Submissions</a></li>
						<li class="divider"></li>
						<li><a href="/contests/agc047/score"><span class="glyphicon glyphicon-dashboard" aria-hidden="true"></span> My Score</a></li>
					
				</ul>
			</li>
		

		
			
				
					<li><a href="/contests/agc047/standings"><span class="glyphicon glyphicon-sort-by-attributes-alt" aria-hidden="true"></span> Standings</a></li>
				
			
		

		
			<li><a href="/contests/agc047/custom_test"><span class="glyphicon glyphicon-wrench" aria-hidden="true"></span> Custom Test</a></li>
		

		
		
			
			
				<li><a href="https://codeforces.com/blog/entry/81159" target="_blank" rel="noopener"><span class="glyphicon glyphicon-comment" aria-hidden="true"></span> Discuss</a></li>
			
		

		<li class="pull-right"><a id="fix-cnvtb" href="javascript:void(0)"><span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span></a></li>
	</ul>
</div>
	<div class="col-sm-12">
		<span class="h2">
			F - Rooks
			
		</span>
		<span id="task-lang-btn" class="pull-right"><span data-lang="ja"><img src='//img.atcoder.jp/assets/top/img/flag-lang/ja.png'></span> / <span data-lang="en"><img src='//img.atcoder.jp/assets/top/img/flag-lang/en.png'></span></span>
		<script>
			$(function() {
				var ts = $('#task-statement span.lang');
				if (ts.children('span').size() <= 1) {
					$('#task-lang-btn').hide();
					ts.children('span').show();
					return;
				}
				var REMEMBER_LB = 5;
				var LS_KEY = 'task_lang';
				var taskLang = getLS(LS_KEY) || '';
				var changeTimes = 0;
				if (taskLang == 'ja' || taskLang == 'en') {
					changeTimes = REMEMBER_LB;
				} else {
					var changeTimes = parseInt(taskLang, 10);
					if (isNaN(changeTimes)) {
						changeTimes = 0;
						delLS(LS_KEY);
					}
					changeTimes++;
					taskLang = LANG;
				}
				ts.children('span.lang-' + taskLang).show();

				$('#task-lang-btn span').click(function() {
					var l = $(this).data('lang');
					ts.children('span').hide();
					ts.children('span.lang-' + l).show();
					if (changeTimes < REMEMBER_LB) setLS(LS_KEY, changeTimes);
					else setLS(LS_KEY, l);
				});
			});
		</script>
		<hr/>
		<p>
			Time Limit: 1.25 sec / Memory Limit: 1024 MB
			
		</p>

		<div id="task-statement">
			
			<span class="lang">
<span class="lang-ja">
<p>配点 : <var>2200</var> 点</p>

<div class="part">
<section>
<h3>問題文</h3><p>無限に広がるチェス盤上の <var>N</var> 個の敵ルークの位置 <var>(X_i, Y_i)</var> が与えられます。<em>[訳注: ルークは将棋の飛車と似た動きをする駒です。]</em>
どの二つのルークも、お互いを攻められる位置にはありません (すなわち、一行あたり、または一列あたりのルークの数は一個以下です)。</p>
<p>あなたは、ルークのうち一個をキングに置き換え、キングを繰り返し動かしてできるだけ多くのルークを取ろうとしています。<em>[訳注: キングは将棋の王将と似た動きをする駒です。]</em></p>
<p>ルークに攻められているマスに入ることはできません。
また、<strong>斜めに移動することで空きマスに移ることもできません</strong> (しかし、斜めに移動することでルークを取ることはできます)。</p>
<p>(つまり、このキングの動きは、斜め四方向に動いて駒を取ることと縦横四方向に動くことができる強化版ポーンのようなものです。)</p>
<p>各ルークについて、そのルークをキングで置き換えた際に取ることのできる最大数のルークを取るために必要な最小手数を求めてください。</p>
</section>
</div>

<div class="part">
<section>
<h3>制約</h3><ul>
<li><var>2 \leq N \leq 200\,000</var></li>
<li><var>1 \leq X_i, Y_i \leq 10^6</var></li>
<li><var>X_i \neq X_j</var></li>
<li><var>Y_i \neq Y_j</var></li>
<li>入力中の値はすべて整数である。</li>
</ul>
</section>
</div>

<hr />

<div class="io-style">
<div class="part">
<section>
<h3>入力</h3><p>入力は以下の形式で標準入力から与えられる。</p>
<pre><var>N</var>
<var>X_1</var> <var>Y_1</var>
<var>X_2</var> <var>Y_2</var>
<var>\vdots</var>
<var>X_N</var> <var>Y_N</var>
</pre>

</section>
</div>

<div class="part">
<section>
<h3>出力</h3><p><var>N</var> 行出力せよ。
<var>i</var> 行目は、<var>(X_i, Y_i)</var> に置かれたルークをキングに置き換えた場合に対応する。
この行には、一つの整数、すなわち <var>M_i</var> 個のルークを取るために必要な最小手数を出力せよ。
ここで、<var>M_i</var> は (何手かけてもよいとして) この場合に取ることのできるルークの最大数である。</p>
</section>
</div>
</div>

<hr />

<div class="part">
<section>
<h3>入力例 1</h3><pre>6
1 8
6 10
2 7
4 4
9 3
5 1
</pre>

</section>
</div>

<div class="part">
<section>
<h3>出力例 1</h3><pre>5
0
7
5
0
0
</pre>

<p>下図を見てください。
ルーク <var>3</var> をキングに置き換えた場合、他のルークを最大で二個取ることができます。
図の赤い経路がこの場合の最適な手順の一つ - ルーク <var>1</var> を取り、右下方向に進み続けてルーク <var>4</var> を取る - です。
ここでの手数は <var>7</var> 手であり、これが出力例の三つ目の数です。</p>
<p align="center"><img alt="path" src="https://img.atcoder.jp/agc047/rooks_path_small3.png"/></p>

<p align="center"><em><var>x</var> 軸正方向: 右、<var>y</var> 軸正方向: 上</em></p>

<p>ルーク <var>2, 5, 6</var> のいずれかをキングに置き換えた場合には、他のルークを一個も取ることができません。このとき、最小手数は <var>0</var> です。</p>
</section>
</div>

<hr />

<div class="part">
<section>
<h3>入力例 2</h3><pre>5
5 5
100 100
70 20
81 70
800 1
</pre>

</section>
</div>

<div class="part">
<section>
<h3>出力例 2</h3><pre>985
985
1065
1034
0
</pre>

</section>
</div>

<hr />

<div class="part">
<section>
<h3>入力例 3</h3><pre>10
2 5
4 4
13 12
12 13
14 17
17 19
22 22
16 18
19 27
25 26
</pre>

</section>
</div>

<div class="part">
<section>
<h3>出力例 3</h3><pre>2
2
9
9
3
3
24
5
0
25
</pre></section>
</div>
</span>
<span class="lang-en">
<p>Score : <var>2200</var> points</p>

<div class="part">
<section>
<h3>Problem Statement</h3><p>You are given positions <var>(X_i, Y_i)</var> of <var>N</var> enemy rooks on an infinite chessboard.
No two rooks attack each other (at most one rook per row or column).</p>
<p>You're going to replace one rook with a king and then move the king repeatedly to beat as many rooks as possible.</p>
<p>You can't enter a cell that is being attacked by a rook.
Additionally, you <strong>can't move diagonally to an empty cell</strong> (but you can beat a rook diagonally).</p>
<p>(So this king moves like a superpawn that beats diagonally in 4 directions and moves horizontally/vertically in 4 directions.)</p>
<p>For each rook, consider replacing it with a king, and find the minimum possible number of moves
    needed to beat the maximum possible number of rooks.</p>
</section>
</div>

<div class="part">
<section>
<h3>Constraints</h3><ul>
<li><var>2 \leq N \leq 200\,000</var></li>
<li><var>1 \leq X_i, Y_i \leq 10^6</var></li>
<li><var>X_i \neq X_j</var></li>
<li><var>Y_i \neq Y_j</var></li>
<li>All values in input are integers.</li>
</ul>
</section>
</div>

<hr />

<div class="io-style">
<div class="part">
<section>
<h3>Input</h3><p>Input is given from Standard Input in the following format.</p>
<pre><var>N</var>
<var>X_1</var> <var>Y_1</var>
<var>X_2</var> <var>Y_2</var>
<var>\vdots</var>
<var>X_N</var> <var>Y_N</var>
</pre>

</section>
</div>

<div class="part">
<section>
<h3>Output</h3><p>Print <var>N</var> lines.
The <var>i</var>-th line is for scenario of replacing the rook at <var>(X_i, Y_i)</var> with your king.
This line should contain one integer: the minimum number of moves to beat <var>M_i</var> rooks
    where <var>M_i</var> denotes the maximum possible number of beaten rooks in this scenario (in infinite time).</p>
</section>
</div>
</div>

<hr />

<div class="part">
<section>
<h3>Sample Input 1</h3><pre>6
1 8
6 10
2 7
4 4
9 3
5 1
</pre>

</section>
</div>

<div class="part">
<section>
<h3>Sample Output 1</h3><pre>5
0
7
5
0
0
</pre>

<p>See the drawing below.
If we replace rook 3 with a king, we can beat at most two other rooks.
The red path is one of optimal sequences of moves: beat rook 1,
    then keep going down and right until you can beat rook 4.
There are 7 steps and that's the third number in the output.</p>
<p align="center"><img alt="path" src="https://img.atcoder.jp/agc047/rooks_path_small3.png"/></p>

<p align="center"><em>x-coordinate increases from left to right,
    while y increases bottom to top.</em></p>

<p>Starting from rook 2, 5 or 6, we can't beat any other rook.
The optimal number of moves is 0.</p>
</section>
</div>

<hr />

<div class="part">
<section>
<h3>Sample Input 2</h3><pre>5
5 5
100 100
70 20
81 70
800 1
</pre>

</section>
</div>

<div class="part">
<section>
<h3>Sample Output 2</h3><pre>985
985
1065
1034
0
</pre>

</section>
</div>

<hr />

<div class="part">
<section>
<h3>Sample Input 3</h3><pre>10
2 5
4 4
13 12
12 13
14 17
17 19
22 22
16 18
19 27
25 26
</pre>

</section>
</div>

<div class="part">
<section>
<h3>Sample Output 3</h3><pre>2
2
9
9
3
3
24
5
0
25
</pre></section>
</div>
</span>
</span>

		</div>

		

		
		<hr/>
		<form class="form-horizontal form-code-submit" action="/contests/agc047/submit" method="POST">
			<input type="hidden" name="data.TaskScreenName" value="agc047_f" />
			
			<div class="form-group ">
				<label class="control-label col-sm-2" for="select-lang">Language</label>
				<div id="select-lang" class="col-sm-5" data-name="data.LanguageId">
					<select class="form-control current" data-placeholder="-" name="data.LanguageId" required>
						<option></option>
						
							<option value="4001" data-mime="text/x-csrc">C (GCC 9.2.1)</option>
						
							<option value="4002" data-mime="text/x-csrc">C (Clang 10.0.0)</option>
						
							<option value="4003" data-mime="text/x-c&#43;&#43;src">C&#43;&#43; (GCC 9.2.1)</option>
						
							<option value="4004" data-mime="text/x-c&#43;&#43;src">C&#43;&#43; (Clang 10.0.0)</option>
						
							<option value="4005" data-mime="text/x-java">Java (OpenJDK 11.0.6)</option>
						
							<option value="4006" data-mime="text/x-python">Python (3.8.2)</option>
						
							<option value="4007" data-mime="text/x-sh">Bash (5.0.11)</option>
						
							<option value="4008" data-mime="text/x-bc">bc (1.07.1)</option>
						
							<option value="4009" data-mime="text/x-sh">Awk (GNU Awk 4.1.4)</option>
						
							<option value="4010" data-mime="text/x-csharp">C# (.NET Core 3.1.201)</option>
						
							<option value="4011" data-mime="text/x-csharp">C# (Mono-mcs 6.8.0.105)</option>
						
							<option value="4012" data-mime="text/x-csharp">C# (Mono-csc 3.5.0)</option>
						
							<option value="4013" data-mime="text/x-clojure">Clojure (1.10.1.536)</option>
						
							<option value="4014" data-mime="text/x-crystal">Crystal (0.33.0)</option>
						
							<option value="4015" data-mime="text/x-d">D (DMD 2.091.0)</option>
						
							<option value="4016" data-mime="text/x-d">D (GDC 9.2.1)</option>
						
							<option value="4017" data-mime="text/x-d">D (LDC 1.20.1)</option>
						
							<option value="4018" data-mime="application/dart">Dart (2.7.2)</option>
						
							<option value="4019" data-mime="text/x-dc">dc (1.4.1)</option>
						
							<option value="4020" data-mime="text/x-erlang">Erlang (22.3)</option>
						
							<option value="4021" data-mime="elixir">Elixir (1.10.2)</option>
						
							<option value="4022" data-mime="text/x-fsharp">F# (.NET Core 3.1.201)</option>
						
							<option value="4023" data-mime="text/x-fsharp">F# (Mono 10.2.3)</option>
						
							<option value="4024" data-mime="text/x-forth">Forth (gforth 0.7.3)</option>
						
							<option value="4025" data-mime="text/x-fortran">Fortran(GNU Fortran 9.2.1)</option>
						
							<option value="4026" data-mime="text/x-go">Go (1.14.1)</option>
						
							<option value="4027" data-mime="text/x-haskell">Haskell (GHC 8.8.3)</option>
						
							<option value="4028" data-mime="text/x-haxe">Haxe (4.0.3); js</option>
						
							<option value="4029" data-mime="text/x-haxe">Haxe (4.0.3); Java</option>
						
							<option value="4030" data-mime="text/javascript">JavaScript (Node.js 12.16.1)</option>
						
							<option value="4031" data-mime="text/x-julia">Julia (1.4.0)</option>
						
							<option value="4032" data-mime="text/x-kotlin">Kotlin (1.3.71)</option>
						
							<option value="4033" data-mime="text/x-lua">Lua (Lua 5.3.5)</option>
						
							<option value="4034" data-mime="text/x-lua">Lua (LuaJIT 2.1.0)</option>
						
							<option value="4035" data-mime="text/x-sh">Dash (0.5.8)</option>
						
							<option value="4036" data-mime="text/x-nim">Nim (1.0.6)</option>
						
							<option value="4037" data-mime="text/x-objectivec">Objective-C (Clang 10.0.0)</option>
						
							<option value="4038" data-mime="text/x-common-lisp">Common Lisp (SBCL 2.0.3)</option>
						
							<option value="4039" data-mime="text/x-ocaml">OCaml (4.10.0)</option>
						
							<option value="4040" data-mime="text/x-octave">Octave (5.2.0)</option>
						
							<option value="4041" data-mime="text/x-pascal">Pascal (FPC 3.0.4)</option>
						
							<option value="4042" data-mime="text/x-perl">Perl (5.26.1)</option>
						
							<option value="4043" data-mime="text/x-perl">Raku (Rakudo 2020.02.1)</option>
						
							<option value="4044" data-mime="text/x-php">PHP (7.4.4)</option>
						
							<option value="4045" data-mime="text/x-prolog">Prolog (SWI-Prolog 8.0.3)</option>
						
							<option value="4046" data-mime="text/x-python">PyPy2 (7.3.0)</option>
						
							<option value="4047" data-mime="text/x-python">PyPy3 (7.3.0)</option>
						
							<option value="4048" data-mime="text/x-racket">Racket (7.6)</option>
						
							<option value="4049" data-mime="text/x-ruby">Ruby (2.7.1)</option>
						
							<option value="4050" data-mime="text/x-rustsrc">Rust (1.42.0)</option>
						
							<option value="4051" data-mime="text/x-scala">Scala (2.13.1)</option>
						
							<option value="4052" data-mime="text/x-java">Java (OpenJDK 1.8.0)</option>
						
							<option value="4053" data-mime="text/x-scheme">Scheme (Gauche 0.9.9)</option>
						
							<option value="4054" data-mime="text/x-sml">Standard ML (MLton 20130715)</option>
						
							<option value="4055" data-mime="text/x-swift">Swift (5.2.1)</option>
						
							<option value="4056" data-mime="text/plain">Text (cat 8.28)</option>
						
							<option value="4057" data-mime="text/typescript">TypeScript (3.8)</option>
						
							<option value="4058" data-mime="text/x-vb">Visual Basic (.NET Core 3.1.101)</option>
						
							<option value="4059" data-mime="text/x-sh">Zsh (5.4.2)</option>
						
							<option value="4060" data-mime="text/x-cobol">COBOL - Fixed (OpenCOBOL 1.1.0)</option>
						
							<option value="4061" data-mime="text/x-cobol">COBOL - Free (OpenCOBOL 1.1.0)</option>
						
							<option value="4062" data-mime="text/x-brainfuck">Brainfuck (bf 20041219)</option>
						
							<option value="4063" data-mime="text/x-ada">Ada2012 (GNAT 9.2.1)</option>
						
							<option value="4064" data-mime="text/x-unlambda">Unlambda (2.0.0)</option>
						
							<option value="4065" data-mime="text/x-python">Cython (0.29.16)</option>
						
							<option value="4066" data-mime="text/x-sh">Sed (4.4)</option>
						
							<option value="4067" data-mime="text/x-vim">Vim (8.2.0460)</option>
						
					</select>
					<span class="error"></span>
				</div>
			</div>
			<script>var currentLang = getLS('defaultLang');</script>
			
			
<div class="form-group">
	<label class="control-label col-sm-2" for="sourceCode">Source Code</label>
	<div class="col-sm-7" id="sourceCode">
		<div class="div-editor">
			<textarea class="form-control editor" name="sourceCode"></textarea>
		</div>
		<textarea class="form-control plain-textarea" style="display:none;"></textarea>
		<p>
			<span class="gray">※ at most 512 KiB</span><br>
			<span class="gray">※ Your source code will be saved as Main.<i>extension</i>.</span>
		</p>
	</div>
	<div class="col-sm-3 editor-buttons">
		<p><button id="btn-open-file" type="button" class="btn btn-default btn-sm">
			<span class="glyphicon glyphicon-folder-open" aria-hidden="true"></span> &nbsp; Open File
		</button></p>
		<p><button type="button" class="btn btn-default btn-sm btn-toggle-editor" data-toggle="button" aria-pressed="false" autocomplete="off">
			Toggle Editor
		</button></p>
		<p><button type="button" class="btn btn-default btn-sm btn-auto-height" data-toggle="button" aria-pressed="false" autocomplete="off">
			Auto Height
		</button></p>
	</div>
	<input id="input-open-file" type="file" style="display:none;">
</div>

			<input type="hidden" name="csrf_token" value="pxc8jUTL&#43;cnm&#43;3pHyWXo&#43;ZvXhCoZvLir5KjhyviaOWM=" />
			<div class="form-group">
				<label class="control-label col-sm-2" for="submit"></label>
				<div class="col-sm-5">
					<button type="submit" class="btn btn-primary" id="submit">Submit</button>
				</div>
			</div>
		</form>
		
	</div>
</div>




		
			<hr>
			
			
			
<div class="a2a_kit a2a_kit_size_20 a2a_default_style pull-right" data-a2a-url="https://atcoder.jp/contests/agc047/tasks/agc047_f?lang=en" data-a2a-title="F - Rooks">
	<a class="a2a_button_facebook"></a>
	<a class="a2a_button_twitter"></a>
	
		<a class="a2a_button_telegram"></a>
	
	<a class="a2a_dd" href="https://www.addtoany.com/share"></a>
</div>

		
		<script async src="//static.addtoany.com/menu/page.js"></script>
		
	</div> 
	<hr>
</div> 

	<div class="container" style="margin-bottom: 80px;">
			<footer class="footer">
			
				<ul>
					<li><a href="/contests/agc047/rules">Rule</a></li>
					<li><a href="/contests/agc047/glossary">Glossary</a></li>
					
				</ul>
			
			<ul>
				<li><a href="/tos">Terms of service</a></li>
				<li><a href="/privacy">Privacy Policy</a></li>
				<li><a href="/personal">Information Protection Policy</a></li>
				<li><a href="/company">Company</a></li>
				<li><a href="/faq">FAQ</a></li>
				<li><a href="/contact">Contact</a></li>
				
			</ul>
			<div class="text-center">
					<small id="copyright">Copyright Since 2012 &copy;<a href="http://atcoder.co.jp">AtCoder Inc.</a> All rights reserved.</small>
			</div>
			</footer>
	</div>
	<p id="fixed-server-timer" class="contest-timer"></p>
	<div id="scroll-page-top" style="display:none;"><span class="glyphicon glyphicon-arrow-up" aria-hidden="true"></span> Page Top</div>

</body>
</html>

